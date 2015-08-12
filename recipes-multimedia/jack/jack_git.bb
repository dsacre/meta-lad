SUMMARY = "JACK audio server"
DESCRIPTION = "JACK is a low-latency audio server. It can \
connect a number of different applications to an audio \
device, as well as allowing them to share audio between \
themselves."
SECTION = "libs/multimedia"

LICENSE = "GPLv2 & LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=c030468238b2cf89925a57f2780396a7 \
                    file://COPYING.GPL;md5=94d55d512a9ba36caa9b7df079bae19f \
                    file://COPYING.LGPL;md5=e77fe93202736b47c07035910f47974a \
"

DEPENDS = "alsa-lib libsamplerate0 libsndfile1 readline db"

PV = "git${SRCPV}"

SRCREV = "9519d3034f3764578e55090b8d85bf15806c334c"
SRC_URI = "\
    gitsm://github.com/dsacre/jack1.git \
    file://remove-wrong-host-test.patch \
"
S = "${WORKDIR}/git"

inherit autotools pkgconfig

EXTRA_OECONF = "--disable-portaudio \
                --disable-coreaudio \
                --disable-oss \
                --enable-alsa"

PACKAGES =+ "libjack jack-server jack-utils"
PACKAGES_remove = "jack"

FILES_libjack = "${libdir}/*.so.* ${libdir}/jack/*.so"
FILES_jack-server = "${bindir}/jackd"
FILES_jack-utils = "${bindir}/*"
FILES_${PN}-doc += " ${datadir}/jack-audio-connection-kit/reference/html/* "

RDEPENDS_${PN}-dev = "libjack (= ${EXTENDPKGV})"
