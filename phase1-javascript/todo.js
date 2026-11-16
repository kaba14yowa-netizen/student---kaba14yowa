const input = document.getElementById("todoInput");
const addButton = document.getElementById("addButton");
const todoList = document.getElementById("todoList");

addButton.addEventListener("click", function () {
  const text = input.value; // 入力欄の値を読み取る
  if (text === "") {
    return; // 空のときは何もしない（return で処理を抜ける）
  }

  const item = document.createElement("li"); // 新しい項目を作る
  item.textContent = text;

  const deleteButton = document.createElement("button");
  deleteButton.textContent = "削除";
  deleteButton.classList.add("delete-btn");
  item.appendChild(deleteButton);

  todoList.appendChild(item);                // リストに追加する

  input.value = ""; // 次の入力に備えて、入力欄を空にする
});

todoList.addEventListener("click", function (event) {
  if (event.target.tagName === "LI") {
    event.target.classList.toggle("completed");
  }

   if (event.target.classList.contains("delete-btn")) {
    const item = event.target.parentElement; 
    todoList.removeChild(item);              
  }

});