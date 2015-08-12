SUMMARY = "SWH Plugins in LV2 format"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"

DEPENDS = "lv2 fftw"

PV = "git${SRCPV}"

SRCREV = "5098e09e255eaed14e0d40ca5e7e6dfcb782d7ea"
SRC_URI = "git://github.com/swh/lv2.git"

S = "${WORKDIR}/git"

do_install() {
    oe_runmake INSTALL_DIR_REALLY=${D}${libdir}/lv2 install-really
}

FILES_${PN} += "${libdir}/lv2/*.lv2/*.*"
FILES_${PN}-dbg += "${libdir}/lv2/*.lv2/.debug/*"
