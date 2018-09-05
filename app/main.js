import React, { Component } from 'react';
import {
  AppRegistry,
  StyleSheet,
  Text,
  View,requireNativeComponent,
  TouchableOpacity,Dimensions
} from 'react-native';

var { NativeEventEmitter, DeviceEventEmitter, NativeModules } = require('react-native');

let AndroidPage = requireNativeComponent('AndroidPage', AndroidPage);
import Circle from './Circle';

import Trend from './Trend';

const width =  Dimensions.get('window').width
const height = Dimensions.get('window').height

// var Trend = requireNativeComponent('TrendManager', TrendManager);
export default class Main extends Component {

  componentDidMount() {

  }

  testToast(){
      NativeModules.ToastModule.show("111")
  }

  render() {
    return (
      <View style={styles.container}>
          {/* <Circle style={{width: 100, height: 100}} /> */}
          <Trend  style={{width: width, height: height}}/>
          {/* <TouchableOpacity onPress={()=>{this.testToast()}}>
            <Text style={styles.welcome}>
                主页面
            </Text>
          </TouchableOpacity> */}
      </View>
    );
  }


}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    justifyContent: 'center',
    alignItems: 'center',
    backgroundColor: '#F5FCFF',
  },
  welcome: {
    fontSize: 20,
    textAlign: 'center',
    margin: 10,
  },
  instructions: {
    textAlign: 'center',
    color: '#333333',
    marginBottom: 5,
  }
  
});

