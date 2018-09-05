import React, { Component } from 'react';
import {
  AppRegistry
} from 'react-native';
import Tab from './app/Tab';

export default class TestSdk extends Component {
    render() {
      return <Tab/>
    }
  // render() {
  //   return (
  //       Hello, World
  //     )
  // }
}

// AppRegistry.registerComponent('HelloWorld', () => HelloWorld);
AppRegistry.registerComponent('TestSdk', () => TestSdk);
