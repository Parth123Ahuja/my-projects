let imagePath = [
    "/public/download1.jpeg",
    "/public/download2.jpeg",
    "/public/download3.jpeg",
    "/public/download4.jpeg",
    "/public/download5.jpeg",
    "/public/download6.jpeg",
    "/public/download7.jpeg",
    "/public/download8.jpeg",
    "/public/download9.jpeg"
]

function RandomImageGenerator(imagePath){
    const RandomIndex = Math.floor(Math.random()*imagePath.length);
    return imagePath[RandomIndex]

}
    
let getPath = RandomImageGenerator

module.exports.getPath = getPath
module.exports.imagePath = imagePath



