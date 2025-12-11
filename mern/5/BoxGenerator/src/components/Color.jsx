import React from 'react'

const Color = (props) => {
    return (
        <>
            <div className={`w-[200px] h-[200px] ${props.co} bg-green`}>
            </div>
        </>
    );
}

export default Color;