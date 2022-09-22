def call(value) {
    println 'before action3: ' + devportal.releaseInfoMap

    devportal.releaseInfoMap['devportal.action3'] = value

    println "devportal.releaseInfoMap: " + devportal.releaseInfoMap
}
