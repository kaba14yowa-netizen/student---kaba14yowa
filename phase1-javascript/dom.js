const title = document.getElementById("title");
title.textContent = "果物の名前";

const list = document.getElementById("fruits");
const item = document.createElement("li");
item.textContent = "マスカット";
list.appendChild(item);

const item2 = document.createElement("li");
item2.textContent = "柿";
list.appendChild(item2);    