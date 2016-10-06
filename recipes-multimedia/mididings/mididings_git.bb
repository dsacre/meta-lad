SUMMARY = "mididings"
DESCRIPTION = "MIDI router and processor"
SECTION = "console/multimedia"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=751419260aa954499f7abaabaa882bbe"

DEPENDS = "alsa-lib jack boost glib-2.0"
RDEPENDS_${PN} += "python3-decorator"

S = "${WORKDIR}/git"
SRCREV = "bbec99a8c878a2a7029e78e84fc736e4a68ed5a0"
SRC_URI = "git://github.com/dsacre/mididings.git"
PV = "git${SRCPV}"

inherit setuptools3

do_install_append() {
    for s in ${D}${bindir}/*; do
        sed -i -e '1s|^#!.*|#!/usr/bin/env python3|' $s
    done
}

RDEPENDS_${PN} += "\
    python3-misc \
    python3-subprocess \
    python3-threading \
    python3-textutils \
    python3-importlib \
"
