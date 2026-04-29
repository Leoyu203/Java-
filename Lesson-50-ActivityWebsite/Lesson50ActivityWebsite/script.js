
let tracks;

async function init() {
  let link = "https://potential-doodle-9759v5v7gjr5376w-8500.app.github.dev/";
  let route = "tracks";

  let info = await fetch(link + route);
  tracks = await info.json();

  console.log(tracks);
  displayTracks(tracks);
}

function displayTracks(songs) {
  let output = "";

  for (let i = 0; i < songs.length; i++) {
    output += `
      <div class="card">
      <h3>${songs[i].Name}</h3>
      <p>Id: ${songs[i].TrackId}</p>
      <p>Cost: $${songs[i].UnitPrice}</p>
      </div>
    `;
  }

  document.getElementById("output").innerHTML = output;
}



