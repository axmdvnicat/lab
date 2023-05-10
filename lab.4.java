let sayi = parseInt(prompt("Ededi daxil edin"));

if (sayi % 2 === 0) {
  if (sayi < 0) {
    alert(sayi + " Eded menfi cut ededdir");
  } else {
    alert(sayi + " Eded musbet cut ededdir");
  }
} else {
  if (sayi < 0) {
    alert(sayi + " Eded menfi tek ededdir");
  } else {
    alert(sayi + " Eded musbet tek ededdir");
  }
}