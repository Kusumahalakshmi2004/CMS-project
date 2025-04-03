import React, { useEffect, useState } from 'react';
import { getHeading } from '../api';

const Home = () => {
    const [heading, setHeading] = useState("Loading...");

    useEffect(() => {
        const fetchHeading = async () => {
            const data = await getHeading();
            setHeading(data.heading);
        };
        fetchHeading();
    }, []);

    return (
        <div className="flex justify-center items-center h-screen bg-gray-100">
            <h1 className="text-3xl font-bold text-blue-600">{heading}</h1>
        </div>
    );
};

export default Home;
