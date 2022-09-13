 
listView('FEFEFEFEF Jobs') {
    description('FEFEFEFEF Jobs')
    jobs {
        regex('FEFEFEFEF_.+')
    }
    columns {
        status()
        weather()
        name()
        lastSuccess()
        lastFailure()
        lastDuration()
        buildButton()
    }
}
