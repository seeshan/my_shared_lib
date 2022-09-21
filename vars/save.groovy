
def call(Map releaseInfoMap, step) {
    echo 'save step'

    releaseInfoMap['save'] = step

    devportal.releaseInfoMap['devportal.save'] ] step

    println "releaseInfoMap: " + releaseInfoMap
    println "devportal.releaseInfoMap: " + devportal.releaseInfoMap
}
