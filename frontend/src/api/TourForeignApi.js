import Api from './Api';

const url = "/toursForeign";

const getAll = () => {
    return Api.get(`${url}`);
}

const getListToursForeign = (page = 1, size = 3, sortField = 'tourForeignId', sortType = 'desc') => {
    const parameters = {
        page,
        size,
        sort: `${sortField},${sortType}`,
    }

    return Api.get(`${url}`, { params: parameters })
}

// delete groups

// delete one group

// {ids.toString()} viết thêm toString để ra nhận được dạng dấu " , "
const api = { getAll, getListToursForeign };
export default api;