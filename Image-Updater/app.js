const express = require('express')
const app = express()
const random = require('./util/random')


app.set('view engine','ejs')
app.use('/public',express.static(__dirname+'/public'));


app.get('/',(req,res)=>{
    let path = random.getPath(random.imagePath)
    res.render('index',{path:path});
})

app.listen(3000);