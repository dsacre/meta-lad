SUMMARY = "Lilv is a C library to make the use of LV2 plugins as simple as possible for applications."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://COPYING;md5=9f6de02da791b5def4aa51ea92a6fc94"

DEPENDS = "lv2 serd sord sratom"

SRC_URI = "http://download.drobilla.net/${PN}-${PV}.tar.bz2"
SRC_URI[md5sum] = "f88419fa70cc96dfdc7e0bf3cd09b180"
SRC_URI[sha256sum] = "428a39f1265d44c55f2604829a12ade0ea13e1a1022ff937ca2a9ad227bd422a"

inherit waf

EXTRA_OECONF = "--no-bash-completion"
