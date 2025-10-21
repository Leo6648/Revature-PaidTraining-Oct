let outPut = document.getElementById("output")
let zeldaUrl = "https://zelda.fanapis.com/api"
let endpoint = "/games?limit=2"

async function makeFetchRequest() {
    let resp = await fetch(zeldaUrl+endpoint)
    outPut.innerText = await resp.text()
}