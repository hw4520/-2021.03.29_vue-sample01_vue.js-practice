module.exports = {
  devServer : {
    proxy: {
      '/api': {
        target: 'http://0.0.0.0:9000'
      }
    }
  }
}
