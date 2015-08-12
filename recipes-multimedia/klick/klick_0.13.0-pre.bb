SUMMARY = "klick"
DESCRIPTION = "An advanced metronome for JACK"
SECTION = "console/multimedia"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=751419260aa954499f7abaabaa882bbe"

DEPENDS = "jack libsamplerate0 libsndfile1 liblo boost"

SRCREV = "c05071081165e2bab66fb839a128925cd361d939"
SRC_URI = "git://github.com/dsacre/klick.git"

S = "${WORKDIR}/git"

EXTRA_OESCONS = "RUBBERBAND=False"

inherit scons

do_install() {
    mkdir -p ${D}${prefix}
    ${STAGING_BINDIR_NATIVE}/scons DESTDIR=${D} PREFIX=${prefix} install ${EXTRA_OESCONS} || \
    bbfatal "scons install execution failed."
}
