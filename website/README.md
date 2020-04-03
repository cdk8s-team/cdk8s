# cdk8s.io

This directory contains the source of the cdk8s.io website.

## Development

You'll need to install [hugo](https://gohugo.io/getting-started/installing) locally.

Then run this to start a local server:

```shell
cd website
hugo server
```

Open your browser at http://localhost:1313/ and you should see the website. Any changes will be applied automatically (magic!).

## Front Page Content

The content of the front page is maintained under `website/config.yaml`. 
You'll see the various sections, and some commentary from the theme authors on where images are loaded from.

Sections can be removed by simply omitting their `sectionN` key from `config.yaml`.

That's it.

