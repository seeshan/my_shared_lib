def call(Map releaseInfoMap, action) {
    echo 'save2 step'

    releaseInfoMap['save2'] = action
    devportal.releaseInfoMap['devportal.save2'] = action

    println "releaseInfoMap: " + releaseInfoMap
    println "devportal.releaseInfoMap: " + devportal.releaseInfoMap
}
