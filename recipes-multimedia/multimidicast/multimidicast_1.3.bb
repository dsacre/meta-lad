SUMMARY = "multimidicast"
SECTION = "console/multimedia"
LICENSE = "BSD"

DEPENDS = "alsa-lib"

SRC_URI = "http://llg.cubic.org/tools/multimidicast/multimidicast-1.3.tar.gz"
SRC_URI[md5sum] = "9dccef9df5033d89176ed597a73ac8b6"
SRC_URI[sha256sum] = "7015dcf0447b930968ad19bdd0ca24ce0ac5ec396a1c165621a67c4eab058554"

LIC_FILES_CHKSUM = "file://multimidicast.cpp;beginline=1;endline=20;md5=2089c2cefe860d168b0285ee548b3490"

do_install() {
    install -d ${D}${bindir}
    install -m 0755 multimidicast ${D}${bindir}
}
