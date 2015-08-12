SUMMARY = "jackmeter"
DESCRIPTION = "Jack Meter is a basic console based DPM (Digital Peak Meter) for JACK."
SECTION = "console/multimedia"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=94d55d512a9ba36caa9b7df079bae19f"

DEPENDS = "jack"

S = "${WORKDIR}/git"
SRCREV = "b967ab3e15f30403cdba435e85df11d880a2bb46"
SRC_URI = "git://github.com/njh/jackmeter.git"
PV = "git${SRCPV}"

inherit autotools pkgconfig
