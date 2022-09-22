def call(value, Map releaseInfoMap = devportal.releaseInfoMap) {
    println 'before action2: ' + releaseInfoMap

    releaseInfoMap['action2'] = value

    println "releaseInfoMap: " + releaseInfoMap
    println "devportal.releaseInfoMap: " + devportal.releaseInfoMap
}
