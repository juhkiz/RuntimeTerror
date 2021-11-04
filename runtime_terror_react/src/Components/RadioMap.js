import React from 'react'


const RadioMap = props => {
    return props.data.map((data) => {
      const radio = 
      <div>  
         <input type= {props.type ? props.type: ""}
          value={data} name = { props.name ? props.name : "" } 
          /> 
            {data}
        </div>;
      return radio;
    });
  };

  export default RadioMap;


