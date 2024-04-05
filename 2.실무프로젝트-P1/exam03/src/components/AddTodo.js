import { MdOutlineAdd } from 'react-icons/md';
import { useEffect } from 'react';

const AddTodo = ({ onSubmit, onChange, todo, message }) => {
  useEffect(() => {
    //componentDidMount(), componentDidUpdate() 시에
    console.log('todo, message 값 변경 - 랜더링 후');

    return () => {
      console.log('뒷정리 함수../ update');
    };

  }, [todo, message]); // [..] 변화감지 기준

  useEffect(() => {
    console.log('마운트시 한번만 호출');
  }, []); //componentDidMount(),
  /*
  useEffect(() => {
    console.log("message 값 변경");
  }, [message]);
  */

  return (
    <form onSubmit={onSubmit} autoComplete="off">
      <input type="text" value={todo ?? ''} onChange={onChange} />
      <button type="submit">
        <MdOutlineAdd />
      </button>
      {message && <div>{message}</div>}
    </form>
  );
};
export default AddTodo;
