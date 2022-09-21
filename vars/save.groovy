
def call(Map releaseInfoMap, step) {
    echo 'set step'

    releaseInfoMap['step'] = step

    println releaseInfoMap
}
