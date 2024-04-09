import React from 'react';
import { useNavigate } from 'react-router-dom';

const NotFound = () => {
    const navigate = useNavigate();

  return (
    <>
    <h1> Page Not Found !!!</h1>
    <button type='button' onClick={() => navigate(-1)}>이전 페이지</button>
    <button type='button' onClick={() => navigate('/', { replace:true})}>메인페이지</button>
    </>
    );
  ;
};
export default React.memo(NotFound);

