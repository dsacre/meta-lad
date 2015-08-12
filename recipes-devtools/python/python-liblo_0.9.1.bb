SUMMARY = "Python OSC bindings"
SECTION = "libs/multimedia"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=fbc093901857fcd118f065f900982c24"

DEPENDS = "liblo"

SRC_URI = "http://das.nasophon.de/download/pyliblo-0.9.1.tar.gz"
SRC_URI[md5sum] = "eb2b2b86031b702eba8e65da75fbaacc"
SRC_URI[sha256sum] = "fb9b0dbd6f3c77b621fd45db56eed470dae2ed1325a49611c2ed0a07eefff4ab"

S = "${WORKDIR}/pyliblo-${PV}"

inherit distutils
