SUMMARY = "Python decorator utilities"
SECTION = "devel/python"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://COPYING.txt;md5=39dacabe5494f61c8680f6fa7323b596"

SRCNAME = "beautifulsoup4"

SRC_URI = "http://www.crummy.com/software/BeautifulSoup/bs4/download/4.4/beautifulsoup4-${PV}.tar.gz"
S = "${WORKDIR}/${SRCNAME}-${PV}"

inherit setuptools

SRC_URI[md5sum] = "63d1f33e6524f408cb6efbc5da1ae8a5"
SRC_URI[sha256sum] = "fad91da88f69438b9ba939ab1b2cabaa31b1d914f1cccb4bb157a993ed2917f6"
