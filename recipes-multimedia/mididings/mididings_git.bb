SUMMARY = "mididings"
DESCRIPTION = "MIDI router and processor"
SECTION = "console/multimedia"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=751419260aa954499f7abaabaa882bbe"

DEPENDS = "alsa-lib jack boost"
RDEPENDS_${PN} = "python3-decorator"

S = "${WORKDIR}/git"
SRCREV = "b2e45015ed9ecab75b1efa92c7d805b00ff3a023"
SRC_URI = "git://github.com/dsacre/mididings.git \
           file://dont-use-setuptools.patch;striplevel=0"
PV = "git${SRCPV}"

inherit distutils3

do_install_append() {
    for s in ${D}${bindir}/*; do
        sed -i -e '1s|^#!.*|#!/usr/bin/env python3|' $s
    done
}

RDEPENDS_${PN} += "python3-io python3-codecs python3-misc \
                   python3-subprocess python3-threading python3-textutils \
                   python3-importlib"
