import { PropTypes } from 'react';
import { requireNativeComponent, View } from 'react-native';

const Trend = requireNativeComponent('TrendManager', {
  propTypes: {
    ...View.propTypes // 包含默认的View的属性
  }
});

export default Trend;

//4381a2e