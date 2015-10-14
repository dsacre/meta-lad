SUMMARY = "OSC library"
SECTION = "libs/multimedia"
LICENSE = "LGPLv2.1"

SRC_URI = "\
    ${SOURCEFORGE_MIRROR}/liblo/liblo-0.28.tar.gz \
    file://fix-poll-h-include-for-musl.patch \
"

SRC_URI[md5sum] = "e2a4391a08b49bb316c03e2034e06fa2"
SRC_URI[sha256sum] = "da94a9b67b93625354dd89ff7fe31e5297fc9400b6eaf7378c82ee1caf7db909"

LIC_FILES_CHKSUM = "file://COPYING;md5=fbc093901857fcd118f065f900982c24"

S = "${WORKDIR}/liblo-${PV}"

inherit autotools lib_package pkgconfig

CFLAGS_append = " -Wno-maybe-uninitialized"
