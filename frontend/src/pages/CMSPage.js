import React, { useState, useEffect } from 'react';
import { getHeading, updateHeading } from '../api';

const CMSPage = () => {
    const [heading, setHeading] = useState("");

    useEffect(() => {
        const fetchHeading = async () => {
            const data = await getHeading();
            setHeading(data.heading);
        };
        fetchHeading();
    }, []);

    const handleUpdate = async () => {
        await updateHeading(heading);
        alert("Heading updated successfully!");
    };

    return (
        <div className="flex flex-col items-center justify-center h-screen bg-gray-200">
            <input type="text" className="border p-2 w-96" value={heading} onChange={(e) => setHeading(e.target.value)} />
            <button className="mt-4 bg-blue-500 text-white px-4 py-2" onClick={handleUpdate}>Update Heading</button>
        </div>
    );
};

export default CMSPage;
