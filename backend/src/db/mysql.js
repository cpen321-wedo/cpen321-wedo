const mysql = require('mysql')

console.log("creating connection")

const connection = mysql.createConnection({
    host: 'localhost',
    user: 'cpen321',
    password: '*cpen321Wed0$$',
    database: 'cpen321_wedo'
})

connection.connect((err) => {
    if (err) {
        console.log('Error connencting db')
    }
    else {
        console.log('Connected to DB')
    }
})

module.exports = connection