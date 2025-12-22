import React from 'react';

const InputField = ({label,type,data,onChange}) => {
    return (
        <div>
            <label>
                {label}
                <input type={type} name={label} value={data} onChange={(e) => onChange(e.target.value)}/>
            </label>
        </div>
    );
};

export default InputField;