import React from "react";
import { connect } from "react-redux";
import { toggleSidebar } from "../redux/actions/sidebarActions";

import {
  Collapse,
  Navbar,
} from "reactstrap";

// import {
//   AlertCircle,
//   Bell,
//   BellOff,
//   Home,
//   MessageCircle,
//   Settings,
//   User
// } from "react-feather";

// import * as Icon from 'react-feather';

import { selectFullName } from "../redux/Selectors/UserLoginInfoSelectors";

// import { useEffect } from "react";
// import { useState } from "react";
// import UserApi from "../api/UserApi";

const NavbarComponents = (props) => {

  // const handleChange = () => {

  // }

  return (
    <Navbar color="white" light expand>
      <img src='https://dulichkhatvongviet.com/wp-content/uploads/2013/07/logo-va-slogan-xuc-tien-du-lich-viet-nam-o-trong-nuoc.jpg'
      style={{width: '150px', height: '90px', marginLeft:'45%'}} />

      <Collapse navbar>
       
      </Collapse>
    </Navbar>
  );
};

const mapGlobalStateToProps = state => {
  return {
    app: state.app,
    fullName: selectFullName(state)
  }
};

export default connect(mapGlobalStateToProps, { toggleSidebar })(NavbarComponents);
