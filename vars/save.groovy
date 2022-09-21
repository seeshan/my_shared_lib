def call(Map releaseInfoMap, step) {
    println 'save step: ' + devportal.releaseInfoMap

    releaseInfoMap['save'] = step
    devportal.releaseInfoMap['devportal.save'] = step

    println "releaseInfoMap: " + releaseInfoMap
    println "devportal.releaseInfoMap: " + devportal.releaseInfoMap
}
