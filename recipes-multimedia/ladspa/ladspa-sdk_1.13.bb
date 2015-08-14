SUMMARY = "ladspa-sdk"
DESCRIPTION = "LADSPA SDK - Linux Audio Developer's Simple Plugin API"
SECTION = "libs/multimedia"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://doc/COPYING;md5=6fd75d9d2ba6776dcdc4d5257eeab3dd"

#SRC_URI = "http://www.ladspa.org/download/ladspa_sdk_1.13.tgz"
SRC_URI = "http://http.debian.net/debian/pool/main/l/ladspa-sdk/ladspa-sdk_${PV}.orig.tar.gz"
SRC_URI[md5sum] = "671be3e1021d0722cadc7fb27054628e"
SRC_URI[sha256sum] = "b5ed3f4f253a0f6c1b7a1f4b8cf62376ca9f51d999650dd822650c43852d306b"

# use unmodified patches from Debian package
SRC_URI += "\
    file://00_standard-makefile.patch \
    file://01_no-mkdirhier.diff \
    file://02_default-ladspa-path.diff \
    file://05_linking_order.diff \
"

S = "${WORKDIR}/ladspa_sdk"

do_compile() {
    oe_runmake -C src targets
}

do_install() {
    oe_runmake INSTALL_PLUGINS_DIR=${D}/${libdir}/ladspa \
               INSTALL_INCLUDE_DIR=${D}/${includedir} \
               INSTALL_BINARY_DIR=${D}/${bindir} \
               -C src install
}

FILES_${PN} += "${libdir}/ladspa/*.so"
FILES_${PN}-dbg += "${libdir}/ladspa/.debug/*"
