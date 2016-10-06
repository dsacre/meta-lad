SUMMARY = "LV2 port for the CAPS Audio Plugin Suite"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"

DEPENDS = "lv2"

PV = "git${SRCPV}"

SRCREV = "b7d67f94ff7115e947b82bac76b9e5faddbdca76"
SRC_URI = "\
    git://github.com/moddevices/caps-lv2.git \
    file://makefile-cross-compile.patch \
    file://fix-stdint-types-with-musl.patch \
    file://fix-gcc6-build.patch \
"

S = "${WORKDIR}/git"

do_install() {
    oe_runmake DESTDIR=${D} install
    rm -rf ${D}/${libdir}/ladspa
    rm -rf ${D}/${datadir}
}

FILES_${PN} += "${libdir}/lv2/caps.lv2/*"
FILES_${PN}-dbg += "${libdir}/lv2/caps.lv2/.debug/*"
