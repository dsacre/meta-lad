SUMMARY = "LV2 SDK and example plugins"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://COPYING;md5=0383f162366b0c5a316292759a55d292"

DEPENDS = "libsndfile1"

SRC_URI = "http://lv2plug.in/spec/lv2-${PV}.tar.bz2"
SRC_URI[md5sum] = "665580dc761de40b0d335001a204496a"
SRC_URI[sha256sum] = "7a4a53138f10ed997174c8bc5a8573d5f5a5d8441aaac2de6cf2178ff90658e9"

inherit waf

PACKAGES = "${PN}-dev ${PN}-dbg"
FILES_${PN}-dev += "${bindir}/* ${libdir}/lv2/*.lv2/* ${datadir}/lv2specgen/*"
FILES_${PN}-dbg += "${libdir}/lv2/*/.debug/*"
RDEPENDS_${PN}-dev = ""
