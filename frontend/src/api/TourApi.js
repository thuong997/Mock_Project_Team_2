import Api from './Api';

const url = "/tours";

const getAll = () => {
    return Api.get(`${url}`);
}

const getListTours = (page = 1, size = 3, sortField = 'tourId', sortType = 'desc') => {
    const parameters = {
        page,
        size,
        sort: `${sortField},${sortType}`,
    }

    return Api.get(`${url}`, { params: parameters })
}

// delete groups

// delete one group

const api = { getAll, getListTours };
export default api;