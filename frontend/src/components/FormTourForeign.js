import React, { useEffect, useState } from "react";
import {
    Card,
    CardHeader,
    CardImg,
    CardTitle,
    Col,
    ListGroup,
    ListGroupItem,
    Row,

} from "reactstrap";

// import { connect } from "react-redux";
import * as Icon from 'react-feather';
import TourForeignApi from "../api/TourForeignApi";
import Button from "reactstrap/lib/Button";

// import { getListTourAction } from "../redux/actions/TourAction";
// import { selectPage, selectSelectedRows, selectSize, selectTotalSize, selectTours } from "../redux/Selectors/TourSelectors";

const FormTourForeign = () => {

    const Cards = () => {

        const [toursForeign, setTourForeign] = useState([])

        useEffect(() => {
            const getTourForeignList = async () => {
                const result = await TourForeignApi.getListToursForeign();
                const tour = result.content;
                const totalSize = result.totalElements;
                console.log(result);
                setTourForeign(tour, 1, totalSize);
            }
            getTourForeignList();
        }, []);
        return toursForeign.map((e, index) =>
            <Col md="3" lg="4" key={index} >
                <Card  >
                    <CardImg top width="100%" src={e.img1 ? `http://127.0.0.1:8887/img/${e.img1}` : "Ảnh sai"} alt="Card image cap" />
                    <CardHeader >
                    <Icon.Trash size={20} style={{ float: 'right' }} /><Icon.Edit size={20} style={{ float: 'right', marginRight: '5px' }} />
                        <CardTitle tag="h5" className="mb-0">
                            {e.nameTour}
                        </CardTitle>
                    </CardHeader>
                    <ListGroup flush>
                        <ListGroupItem><Icon.Clock size={12} /> Lịch trình: {e.timer}</ListGroupItem>
                        <ListGroupItem><Icon.Calendar size={12} /> Khởi hành: {e.departureDay}</ListGroupItem>
                        <ListGroupItem><Icon.User size={12} /> Số chỗ trống: {e.slotBlank}</ListGroupItem>
                        <ListGroupItem><Icon.DollarSign size={12} />    {e.money}</ListGroupItem>
                    </ListGroup>
                </Card>

            </Col>
        )
    };



    return (
        <div>
            <h2><b><label>TOUR DU LỊCH NƯỚC NGOÀI <Icon.Plus size={32} /></label></b></h2><br></br>
            <Row>
                <Cards />
                <Button className='button'>Xem tất cả</Button>
            </Row>

        </div>
    )
}

// const mapGlobalStateToProps = state => {
//     return {
//         groups: selectTours(state),
//         page: selectPage(state),
//         size: selectSize(state),
//         totalSize: selectTotalSize(state),
//         selectedRows: selectSelectedRows(state)
//     }
// };

// export default connect(mapGlobalStateToProps, { getListTourAction })(FormTour);
export default FormTourForeign;