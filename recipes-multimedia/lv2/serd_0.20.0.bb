SUMMARY = "Serd is a lightweight C library for RDF syntax which supports reading and writing Turtle and NTriples."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://COPYING;md5=9f6de02da791b5def4aa51ea92a6fc94"

SRC_URI = "http://download.drobilla.net/${PN}-${PV}.tar.bz2"
SRC_URI[md5sum] = "cea0f240a6c94f3a7644a35d2f60ed8c"
SRC_URI[sha256sum] = "64515f4f5eb27ba2ba151027a72a77672f6ee8a2a3b58991ad5c045135feabbf"

inherit waf
