import { useState, useRef, useCallback } from 'react';
import AddTodo from '../components/AddTodo';
import TodoList from '../components/TodoList';

const initialValue = [
  { id: 1, title: '할일1', done: true },
  { id: 2, title: '할일2', done: false },
  { id: 3, title: '할일3', done: false },
];

let submitFunc;

const TodoContainer = () => {
  const [items, setItem] = useState(initialValue);
  const [todo, setTodo] = useState('');
  const [message, setMessage] = useState('');

  let id = useRef(4); //할일id

  //할일등록처리
  const onSubmit = useCallback((e) => {
    e.preventDefault();

    if (!todo.trim()) {
      setMessage('할일을 입력하세요.');
      return;
    }

    const newItem = items.concat({
      id: id.current,
      title: todo.trim(),
      done: false,
    });

    setItem((prevItems) => {
      return prevItems.concat({

      });
    });
    id.current++;

    setTodo('');
    setMessage('');
    }, 
    [],
   );

  console.log('같은함수?', submitFunc === onSubmit);
  submitFunc = onSubmit;

  //할일입력시 todo상태값 변경
  const onChange = (e) => setTodo(e.currentTarget.value);
  //할일 목록 완료 여부 토글
  const onToggle = (id) => {
    const newItem = items.map((item) =>
      item.id === id ? { ...item, done: !item.done } : item,
    );
    setItem(newItem);
  };
  //할일 목록 제거
  const onRemove = (id) => {
    const newItem = items.filter((item) => item.id !== id);
    setItem(newItem);
  };

  return (
    <>
      <AddTodo
        onSubmit={onSubmit}
        onChange={onChange}
        todo={todo}
        message={message}
      />
      <TodoList items={items} onToggle={onToggle} onRemove={onRemove} />
    </>
  );
};

export default TodoContainer;
