import axios from 'axios';

const API_URL = 'http://localhost:8080/api';

export const getHeading = async () => {
    const response = await axios.get(`${API_URL}/heading`);
    return response.data;
};

export const updateHeading = async (heading) => {
    await axios.post(`${API_URL}/heading`, { heading });
};
