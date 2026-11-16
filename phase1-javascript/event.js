const textInput = document.getElementById('text-input');
const result = document.getElementById('result');

textInput.addEventListener('input', () => {
    const length = textInput.value.length;

  let message = '';
  if (length > 10) {
    message = '10文字以内にしてください';
  } else {
    message = 'OK';
  }

  result.textContent = `現在${length}文字（${message}）`;
});