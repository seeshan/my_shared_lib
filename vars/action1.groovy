def call(value, Map releaseInfoMap = devportal.releaseInfoMap) {
    println 'before action1: ' + releaseInfoMap

    releaseInfoMap['action1'] = value
    devportal.releaseInfoMap['devportal.action1'] = value

    println "releaseInfoMap: " + releaseInfoMap
    println "devportal.releaseInfoMap: " + devportal.releaseInfoMap
}
