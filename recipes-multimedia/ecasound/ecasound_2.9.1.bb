SUMMARY = "ecasound"
DESCRIPTION = "Ecasound is a software package designed for multitrack audio processing."
SECTION = "console/multimedia"
LICENSE = "GPLv2 & LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=9d6a6692a34f4929021efe2293b5af93 \
                    file://COPYING.GPL;md5=94d55d512a9ba36caa9b7df079bae19f \
                    file://COPYING.LGPL;md5=771782cb6245c7fbbe74bc0ec059beff"

DEPENDS = "alsa-lib jack liblo libsndfile1 libsamplerate0 lilv"

SRC_URI = "http://ecasound.seul.org/download/${PN}-${PV}.tar.gz"
SRC_URI[md5sum] = "13c7be1e4eddc0bbf3792dc17777e465"
SRC_URI[sha256sum] = "39fce8becd84d80620fa3de31fb5223b2b7d4648d36c9c337d3739c2fad0dcf3"

inherit autotools pkgconfig

EXTRA_OECONF = "--disable-pyecasound --disable-rubyecasound \
                --disable-sys-readline --enable-liblilv"
