//함수형 컴포넌트
import { useState } from 'react';

const Counter = () => {
  /*
  const data = useState(0);
  const number = data[0];
  const setNumber = data[1];
  */

  let num = 10;
  console.log('랜더링!', ' num: ', num);

  const [number, setNumber] = useState(3);
  const [number2, setNumber2] = useState(4);
  const plus = () => {
    setNumber(number + 1);
    num++;
  };
  const minus = () => setNumber(number - 1);

  const plus2 = () => {
    setNumber2(number2 + 1);
    num++;
  };
  const minus2 = () => setNumber2(number2 - 1);

  return (
    <>
      <h1>{number}</h1>
      <button type="button" onClick={plus}>
        +1
      </button>
      <button type="button" onClick={minus}>
        -1
      </button>
      <h1>{number2}</h1>
      <button type="button" onClick={plus2}>
        +1
      </button>
      <button type="button" onClick={minus2}>
        -1
      </button>
    </>
  );
};

export default Counter;
