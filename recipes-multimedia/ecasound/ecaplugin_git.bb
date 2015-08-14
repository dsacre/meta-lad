SUMMARY = "ecasound plugin command line utility"
SECTION = "console/multimedia"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=751419260aa954499f7abaabaa882bbe"

S = "${WORKDIR}/git"
SRCREV = "aedbe1ab35446ac8259010a0fc6e841599ef8780"
SRC_URI = "git://github.com/dsacre/ecaplugin"
PV = "git${SRCPV}"

do_install() {
    install -D -m 0755 ${S}/ecaplugin.py ${D}${bindir}/ecaplugin
}

PACKAGES = "ecaplugin"

RDEPENDS_${PN} = "python-bs4 python-lxml"
