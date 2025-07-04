DESCRIPTION = "Scripts for testing Tegra VPI samples"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

SRC_URI = "\
    file://run-vpi3-tests.sh \
"

S = "${UNPACKDIR}"

COMPATIBLE_MACHINE = "(tegra)"

do_install() {
    install -d ${D}${bindir}
    install -m 0755 ${UNPACKDIR}/run-vpi3-tests.sh ${D}${bindir}/run-vpi3-tests
}

PACKAGE_ARCH = "${TEGRA_PKGARCH}"
RDEPENDS:${PN} = "vpi3-samples tegra-tools-jetson-clocks"
