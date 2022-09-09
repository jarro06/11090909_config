 
listView('11090909 Jobs') {
    description('11090909 Jobs')
    jobs {
        regex('11090909_.+')
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
