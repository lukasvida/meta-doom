DESCRIPTION = "A Doom Clone based on SDL"
SECTION = "games"
DEPENDS = "virtual/libsdl libsdl-mixer libsdl-net pkgconfig"
#LICENSE = "GPL"
LICENSE = "CLOSED"
#LIC_FILES_CHKSUM = "file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263"

RRECOMMENDS:${PN} = "freedoom"
DEPENDS = "virtual/libsdl2 libsdl2-mixer libsdl2-net"

PV = "3.1.0"
PR = "r0"
SRC_URI = "https://github.com/chocolate-doom/chocolate-doom/archive/chocolate-doom-${PV}.tar.gz"
SRC_URI[sha256sum] = "f2c64843dcec312032b180c3b2f34b4cb26c4dcdaa7375a1601a3b1df11ef84d"


inherit autotools-brokensep gettext pkgconfig


S = "${WORKDIR}/chocolate-doom-chocolate-doom-${PV}"



FILES:${PN} = "/usr/share ${bindir}"


